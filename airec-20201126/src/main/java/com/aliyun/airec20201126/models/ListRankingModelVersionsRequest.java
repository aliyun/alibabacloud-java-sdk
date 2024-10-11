// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingModelVersionsRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>The state of the version. Valid values: DRAFT: The version is in the draft state. EFFECTIVE: The version is effective. PUBLISHING: The version is being published. INEFFECTIVE: The version has expired. FAILED: The version has not taken effect.</p>
     * 
     * <strong>example:</strong>
     * <p>TRAINING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The ranking model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a-a-a</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static ListRankingModelVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRankingModelVersionsRequest self = new ListRankingModelVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListRankingModelVersionsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListRankingModelVersionsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListRankingModelVersionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListRankingModelVersionsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
