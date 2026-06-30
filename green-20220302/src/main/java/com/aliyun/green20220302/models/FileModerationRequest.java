// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class FileModerationRequest extends TeaModel {
    /**
     * <p>The service supported by enhanced document moderation.</p>
     * 
     * <strong>example:</strong>
     * <p>document_detection</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The set of parameters required for the moderation service. The value must be a JSON string.</p>
     * <ul>
     * <li>url: Required. The URL of the object to be moderated. Make sure that the URL can be accessed over the Internet.</li>
     * <li>dataId: Optional. The data ID that corresponds to the moderated object.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;url&quot;:&quot;<a href="https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.pdf%22%7D">https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.pdf&quot;}</a></p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static FileModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        FileModerationRequest self = new FileModerationRequest();
        return TeaModel.build(map, self);
    }

    public FileModerationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public FileModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
