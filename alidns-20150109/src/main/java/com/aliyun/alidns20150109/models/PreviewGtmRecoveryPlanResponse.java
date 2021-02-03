// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class PreviewGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Previews")
    @Validation(required = true)
    public PreviewGtmRecoveryPlanResponsePreviews previews;

    public static PreviewGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewGtmRecoveryPlanResponse self = new PreviewGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public PreviewGtmRecoveryPlanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewGtmRecoveryPlanResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public PreviewGtmRecoveryPlanResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public PreviewGtmRecoveryPlanResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PreviewGtmRecoveryPlanResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public PreviewGtmRecoveryPlanResponse setPreviews(PreviewGtmRecoveryPlanResponsePreviews previews) {
        this.previews = previews;
        return this;
    }
    public PreviewGtmRecoveryPlanResponsePreviews getPreviews() {
        return this.previews;
    }

    public static class PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfosSwitchInfo extends TeaModel {
        @NameInMap("StrategyName")
        @Validation(required = true)
        public String strategyName;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfosSwitchInfo build(java.util.Map<String, ?> map) throws Exception {
            PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfosSwitchInfo self = new PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfosSwitchInfo();
            return TeaModel.build(map, self);
        }

        public PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfosSwitchInfo setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfosSwitchInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfos extends TeaModel {
        @NameInMap("SwitchInfo")
        @Validation(required = true)
        public java.util.List<PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfosSwitchInfo> switchInfo;

        public static PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfos build(java.util.Map<String, ?> map) throws Exception {
            PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfos self = new PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfos();
            return TeaModel.build(map, self);
        }

        public PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfos setSwitchInfo(java.util.List<PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfosSwitchInfo> switchInfo) {
            this.switchInfo = switchInfo;
            return this;
        }
        public java.util.List<PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfosSwitchInfo> getSwitchInfo() {
            return this.switchInfo;
        }

    }

    public static class PreviewGtmRecoveryPlanResponsePreviewsPreview extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("UserDomainName")
        @Validation(required = true)
        public String userDomainName;

        @NameInMap("SwitchInfos")
        @Validation(required = true)
        public PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfos switchInfos;

        public static PreviewGtmRecoveryPlanResponsePreviewsPreview build(java.util.Map<String, ?> map) throws Exception {
            PreviewGtmRecoveryPlanResponsePreviewsPreview self = new PreviewGtmRecoveryPlanResponsePreviewsPreview();
            return TeaModel.build(map, self);
        }

        public PreviewGtmRecoveryPlanResponsePreviewsPreview setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public PreviewGtmRecoveryPlanResponsePreviewsPreview setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PreviewGtmRecoveryPlanResponsePreviewsPreview setUserDomainName(String userDomainName) {
            this.userDomainName = userDomainName;
            return this;
        }
        public String getUserDomainName() {
            return this.userDomainName;
        }

        public PreviewGtmRecoveryPlanResponsePreviewsPreview setSwitchInfos(PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfos switchInfos) {
            this.switchInfos = switchInfos;
            return this;
        }
        public PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfos getSwitchInfos() {
            return this.switchInfos;
        }

    }

    public static class PreviewGtmRecoveryPlanResponsePreviews extends TeaModel {
        @NameInMap("Preview")
        @Validation(required = true)
        public java.util.List<PreviewGtmRecoveryPlanResponsePreviewsPreview> preview;

        public static PreviewGtmRecoveryPlanResponsePreviews build(java.util.Map<String, ?> map) throws Exception {
            PreviewGtmRecoveryPlanResponsePreviews self = new PreviewGtmRecoveryPlanResponsePreviews();
            return TeaModel.build(map, self);
        }

        public PreviewGtmRecoveryPlanResponsePreviews setPreview(java.util.List<PreviewGtmRecoveryPlanResponsePreviewsPreview> preview) {
            this.preview = preview;
            return this;
        }
        public java.util.List<PreviewGtmRecoveryPlanResponsePreviewsPreview> getPreview() {
            return this.preview;
        }

    }

}
