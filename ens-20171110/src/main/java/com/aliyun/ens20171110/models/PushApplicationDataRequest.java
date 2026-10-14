// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PushApplicationDataRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>Before calling this operation, activate the Edge Application Hosting service and create an application by calling CreateApplication. Obtain the AppId from the response of the CreateApplication operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e76f8985-7965-41fc-925b-9648bb6bf650</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The list of data files to be pre-pushed, in the string format of a JSON array.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;app01\&quot;,       \&quot;version\&quot;:\&quot;1.0\&quot;,       \&quot;size\&quot;:100,\&quot;archiveType\&quot;:\&quot;tar.gz\&quot;,       \&quot;md5\&quot;:\&quot;\&quot;,       \&quot;url\&quot;:\&quot;<a href="http://xxxx%5C%5C%22,%5C%5C%22timeout%5C%5C">http://xxxx\\&quot;,\\&quot;timeout\\</a>&quot;: 1000   },    {       \&quot;name\&quot;:\&quot;app02\&quot;,       \&quot;version\&quot;:\&quot;1.1\&quot;,       \&quot;size\&quot;:10,\&quot;archiveType\&quot;:\&quot;zip\&quot;,       \&quot;md5\&quot;:\&quot;xxxx\&quot;,       \&quot;url\&quot;:\&quot;<a href="http://xxxxxx%5C%5C%22,%5C%5C%22timeout%5C%5C">http://xxxxxx\\&quot;,\\&quot;timeout\\</a>&quot;: 1000   }]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The canary pre-push policy in JSON string format. Multiple distribution policies are supported. By default, all data is pre-pushed.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;name\&quot;: \&quot;ScheduleToRegionId\&quot;,  \&quot;parameters\&quot;:{      \&quot;operator\&quot;: \&quot;In\&quot;,       \&quot;values\&quot;: [\&quot;cn-chegndu-telecom-4\&quot;, \&quot;cn-shanghai-cmcc-4\&quot;]  }}</p>
     */
    @NameInMap("PushStrategy")
    public String pushStrategy;

    /**
     * <p>This parameter is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static PushApplicationDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushApplicationDataRequest self = new PushApplicationDataRequest();
        return TeaModel.build(map, self);
    }

    public PushApplicationDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushApplicationDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PushApplicationDataRequest setPushStrategy(String pushStrategy) {
        this.pushStrategy = pushStrategy;
        return this;
    }
    public String getPushStrategy() {
        return this.pushStrategy;
    }

    public PushApplicationDataRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
