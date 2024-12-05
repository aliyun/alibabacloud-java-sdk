// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineRelatedRecordRequest extends TeaModel {
    /**
     * <p>The routine name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DeleteRoutineRelatedRecord</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The record ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The record name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-xxx.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The website ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteRoutineRelatedRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineRelatedRecordRequest self = new DeleteRoutineRelatedRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineRelatedRecordRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteRoutineRelatedRecordRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public DeleteRoutineRelatedRecordRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public DeleteRoutineRelatedRecordRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
