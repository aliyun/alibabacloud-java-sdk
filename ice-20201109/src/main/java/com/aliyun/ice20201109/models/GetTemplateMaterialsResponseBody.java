// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTemplateMaterialsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;music.mp3&quot;:&quot;<a href="https://bucket.oss-cn-shanghai.aliyuncs.com/music.mp3?sign=xxx%22,%22config.json%22:%22https://bucket.oss-cn-shanghai.aliyuncs.com/config.json?sign=xxx%22,%22assets/1.jpg%22:%22https://bucket.oss-cn-shanghai.aliyuncs.com/assets/1.jpg?sign=xxx%22%7D">https://bucket.oss-cn-shanghai.aliyuncs.com/music.mp3?sign=xxx&quot;,&quot;config.json&quot;:&quot;https://bucket.oss-cn-shanghai.aliyuncs.com/config.json?sign=xxx&quot;,&quot;assets/1.jpg&quot;:&quot;https://bucket.oss-cn-shanghai.aliyuncs.com/assets/1.jpg?sign=xxx&quot;}</a></p>
     */
    @NameInMap("MaterialUrls")
    public String materialUrls;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTemplateMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateMaterialsResponseBody self = new GetTemplateMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateMaterialsResponseBody setMaterialUrls(String materialUrls) {
        this.materialUrls = materialUrls;
        return this;
    }
    public String getMaterialUrls() {
        return this.materialUrls;
    }

    public GetTemplateMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
