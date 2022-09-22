// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateIssueCategoryReportRelationRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RelationModelList")
    public java.util.List<RelationModelList> relationModelList;

    public static CreateIssueCategoryReportRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIssueCategoryReportRelationRequest self = new CreateIssueCategoryReportRelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateIssueCategoryReportRelationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIssueCategoryReportRelationRequest setRelationModelList(java.util.List<RelationModelList> relationModelList) {
        this.relationModelList = relationModelList;
        return this;
    }
    public java.util.List<RelationModelList> getRelationModelList() {
        return this.relationModelList;
    }

    public static class RelationModelList extends TeaModel {
        @NameInMap("CustomerInputContent")
        public String customerInputContent;

        @NameInMap("IssueCategoryId")
        public Long issueCategoryId;

        @NameInMap("IssueCategoryName")
        public String issueCategoryName;

        @NameInMap("MappingTools")
        public String mappingTools;

        @NameInMap("ReportId")
        public String reportId;

        public static RelationModelList build(java.util.Map<String, ?> map) throws Exception {
            RelationModelList self = new RelationModelList();
            return TeaModel.build(map, self);
        }

        public RelationModelList setCustomerInputContent(String customerInputContent) {
            this.customerInputContent = customerInputContent;
            return this;
        }
        public String getCustomerInputContent() {
            return this.customerInputContent;
        }

        public RelationModelList setIssueCategoryId(Long issueCategoryId) {
            this.issueCategoryId = issueCategoryId;
            return this;
        }
        public Long getIssueCategoryId() {
            return this.issueCategoryId;
        }

        public RelationModelList setIssueCategoryName(String issueCategoryName) {
            this.issueCategoryName = issueCategoryName;
            return this;
        }
        public String getIssueCategoryName() {
            return this.issueCategoryName;
        }

        public RelationModelList setMappingTools(String mappingTools) {
            this.mappingTools = mappingTools;
            return this;
        }
        public String getMappingTools() {
            return this.mappingTools;
        }

        public RelationModelList setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

    }

}
