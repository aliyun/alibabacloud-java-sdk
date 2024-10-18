// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineRelatedRecordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CreateRoutineRelatedRecord</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RecordName")
    public String recordName;

    @NameInMap("SiteId")
    public Long siteId;

    public static CreateRoutineRelatedRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineRelatedRecordRequest self = new CreateRoutineRelatedRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoutineRelatedRecordRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRoutineRelatedRecordRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public CreateRoutineRelatedRecordRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
