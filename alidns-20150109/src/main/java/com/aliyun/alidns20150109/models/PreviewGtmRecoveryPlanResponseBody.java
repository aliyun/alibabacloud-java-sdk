// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class PreviewGtmRecoveryPlanResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Previews")
    public PreviewGtmRecoveryPlanResponseBodyPreviews previews;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("TotalItems")
    public Integer totalItems;

    public static PreviewGtmRecoveryPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewGtmRecoveryPlanResponseBody self = new PreviewGtmRecoveryPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewGtmRecoveryPlanResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PreviewGtmRecoveryPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewGtmRecoveryPlanResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public PreviewGtmRecoveryPlanResponseBody setPreviews(PreviewGtmRecoveryPlanResponseBodyPreviews previews) {
        this.previews = previews;
        return this;
    }
    public PreviewGtmRecoveryPlanResponseBodyPreviews getPreviews() {
        return this.previews;
    }

    public PreviewGtmRecoveryPlanResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public PreviewGtmRecoveryPlanResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public static class PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfosSwitchInfo extends TeaModel {
        @NameInMap("StrategyName")
        public String strategyName;

        @NameInMap("Content")
        public String content;

        public static PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfosSwitchInfo build(java.util.Map<String, ?> map) throws Exception {
            PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfosSwitchInfo self = new PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfosSwitchInfo();
            return TeaModel.build(map, self);
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfosSwitchInfo setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfosSwitchInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfos extends TeaModel {
        @NameInMap("SwitchInfo")
        public java.util.List<PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfosSwitchInfo> switchInfo;

        public static PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfos build(java.util.Map<String, ?> map) throws Exception {
            PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfos self = new PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfos();
            return TeaModel.build(map, self);
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfos setSwitchInfo(java.util.List<PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfosSwitchInfo> switchInfo) {
            this.switchInfo = switchInfo;
            return this;
        }
        public java.util.List<PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfosSwitchInfo> getSwitchInfo() {
            return this.switchInfo;
        }

    }

    public static class PreviewGtmRecoveryPlanResponseBodyPreviewsPreview extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SwitchInfos")
        public PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfos switchInfos;

        @NameInMap("Name")
        public String name;

        @NameInMap("UserDomainName")
        public String userDomainName;

        public static PreviewGtmRecoveryPlanResponseBodyPreviewsPreview build(java.util.Map<String, ?> map) throws Exception {
            PreviewGtmRecoveryPlanResponseBodyPreviewsPreview self = new PreviewGtmRecoveryPlanResponseBodyPreviewsPreview();
            return TeaModel.build(map, self);
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviewsPreview setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviewsPreview setSwitchInfos(PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfos switchInfos) {
            this.switchInfos = switchInfos;
            return this;
        }
        public PreviewGtmRecoveryPlanResponseBodyPreviewsPreviewSwitchInfos getSwitchInfos() {
            return this.switchInfos;
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviewsPreview setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviewsPreview setUserDomainName(String userDomainName) {
            this.userDomainName = userDomainName;
            return this;
        }
        public String getUserDomainName() {
            return this.userDomainName;
        }

    }

    public static class PreviewGtmRecoveryPlanResponseBodyPreviews extends TeaModel {
        @NameInMap("Preview")
        public java.util.List<PreviewGtmRecoveryPlanResponseBodyPreviewsPreview> preview;

        public static PreviewGtmRecoveryPlanResponseBodyPreviews build(java.util.Map<String, ?> map) throws Exception {
            PreviewGtmRecoveryPlanResponseBodyPreviews self = new PreviewGtmRecoveryPlanResponseBodyPreviews();
            return TeaModel.build(map, self);
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviews setPreview(java.util.List<PreviewGtmRecoveryPlanResponseBodyPreviewsPreview> preview) {
            this.preview = preview;
            return this;
        }
        public java.util.List<PreviewGtmRecoveryPlanResponseBodyPreviewsPreview> getPreview() {
            return this.preview;
        }

    }

}
