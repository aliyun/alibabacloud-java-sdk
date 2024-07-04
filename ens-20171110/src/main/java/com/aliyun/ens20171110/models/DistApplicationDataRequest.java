// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DistApplicationDataRequest extends TeaModel {
    /**
     * <p>The ID of the application. To obtain the application ID, call the ListApplications operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e76f8985-7965-41fc-925b-9648bb6bf650</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The list of data files that you want to distribute. The value must be a JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;app01\&quot;,        \&quot;version\&quot;:\&quot;1.0\&quot;,        \&quot;destPath\&quot;:\&quot;/root/installed\&quot;,        \&quot;decompress\&quot;:true,        \&quot;targetDirName\&quot;:\&quot;target01\&quot;,        \&quot;fileMode\&quot;:755,        \&quot;timeout\&quot;:1000    },    {        \&quot;name\&quot;:\&quot;app02\&quot;,        \&quot;version\&quot;:\&quot;1.1\&quot;,        \&quot;destPath\&quot;:\&quot;/tmp/test.txt\&quot;,        \&quot;decompress\&quot;:false    }]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The canary release policy. The value must be a JSON string. You can specify multiple distribution policies. By default, all data files are distributed.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;name\&quot;:\&quot;ScheduleToAllByMatchExpressions\&quot;,\&quot;parameters\&quot;:{\&quot;match_expressions\&quot;:[{\&quot;key\&quot;:\&quot;region_id\&quot;,\&quot;operator\&quot;:\&quot;In\&quot;,\&quot;values\&quot;:[\&quot;cn-wuhan-telecom_unicom_cmcc-2\&quot;]}]}}</p>
     */
    @NameInMap("DistStrategy")
    public String distStrategy;

    public static DistApplicationDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DistApplicationDataRequest self = new DistApplicationDataRequest();
        return TeaModel.build(map, self);
    }

    public DistApplicationDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DistApplicationDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DistApplicationDataRequest setDistStrategy(String distStrategy) {
        this.distStrategy = distStrategy;
        return this;
    }
    public String getDistStrategy() {
        return this.distStrategy;
    }

}
