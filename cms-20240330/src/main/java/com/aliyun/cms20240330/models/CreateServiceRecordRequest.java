// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateServiceRecordRequest extends TeaModel {
    /**
     * <p>The content of the entry in JSON string format. The format may vary based on the recordType.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;project&quot;: &quot;proj-xtrace-16c988dcfe21fcb73c5e6f234927d998-cn-hangzhou&quot;,
     *   &quot;storeName&quot;: &quot;app-biz-log&quot;,
     *   &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
     *   &quot;bindType&quot;: &quot;logstore&quot;,
     *   &quot;traceIdRelateField&quot;: &quot;&quot;
     * }</p>
     */
    @NameInMap("recordContent")
    public String recordContent;

    /**
     * <p>The type of the association entry. Valid values: logCorrelation, which indicates application log association.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logCorrelation</p>
     */
    @NameInMap("recordType")
    public String recordType;

    public static CreateServiceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRecordRequest self = new CreateServiceRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRecordRequest setRecordContent(String recordContent) {
        this.recordContent = recordContent;
        return this;
    }
    public String getRecordContent() {
        return this.recordContent;
    }

    public CreateServiceRecordRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

}
