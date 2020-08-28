// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDetectionsRequest extends TeaModel {
    @NameInMap("CreateDateFrom")
    public String createDateFrom;

    @NameInMap("CreateDateTo")
    public String createDateTo;

    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RecordingType")
    public String recordingType;

    @NameInMap("RuleId")
    public String ruleId;

    public static ListDetectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionsRequest self = new ListDetectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDetectionsRequest setCreateDateFrom(String createDateFrom) {
        this.createDateFrom = createDateFrom;
        return this;
    }
    public String getCreateDateFrom() {
        return this.createDateFrom;
    }

    public ListDetectionsRequest setCreateDateTo(String createDateTo) {
        this.createDateTo = createDateTo;
        return this;
    }
    public String getCreateDateTo() {
        return this.createDateTo;
    }

    public ListDetectionsRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public ListDetectionsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDetectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDetectionsRequest setRecordingType(String recordingType) {
        this.recordingType = recordingType;
        return this;
    }
    public String getRecordingType() {
        return this.recordingType;
    }

    public ListDetectionsRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
