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
    public java.util.List<PreviewGtmRecoveryPlanResponseBodyPreviews> previews;

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

    public PreviewGtmRecoveryPlanResponseBody setPreviews(java.util.List<PreviewGtmRecoveryPlanResponseBodyPreviews> previews) {
        this.previews = previews;
        return this;
    }
    public java.util.List<PreviewGtmRecoveryPlanResponseBodyPreviews> getPreviews() {
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

    public static class PreviewGtmRecoveryPlanResponseBodyPreviewsSwitchInfos extends TeaModel {
        @NameInMap("StrategyName")
        public String strategyName;

        @NameInMap("Content")
        public String content;

        public static PreviewGtmRecoveryPlanResponseBodyPreviewsSwitchInfos build(java.util.Map<String, ?> map) throws Exception {
            PreviewGtmRecoveryPlanResponseBodyPreviewsSwitchInfos self = new PreviewGtmRecoveryPlanResponseBodyPreviewsSwitchInfos();
            return TeaModel.build(map, self);
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviewsSwitchInfos setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviewsSwitchInfos setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class PreviewGtmRecoveryPlanResponseBodyPreviews extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SwitchInfos")
        public java.util.List<PreviewGtmRecoveryPlanResponseBodyPreviewsSwitchInfos> switchInfos;

        @NameInMap("Name")
        public String name;

        @NameInMap("UserDomainName")
        public String userDomainName;

        public static PreviewGtmRecoveryPlanResponseBodyPreviews build(java.util.Map<String, ?> map) throws Exception {
            PreviewGtmRecoveryPlanResponseBodyPreviews self = new PreviewGtmRecoveryPlanResponseBodyPreviews();
            return TeaModel.build(map, self);
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviews setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviews setSwitchInfos(java.util.List<PreviewGtmRecoveryPlanResponseBodyPreviewsSwitchInfos> switchInfos) {
            this.switchInfos = switchInfos;
            return this;
        }
        public java.util.List<PreviewGtmRecoveryPlanResponseBodyPreviewsSwitchInfos> getSwitchInfos() {
            return this.switchInfos;
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PreviewGtmRecoveryPlanResponseBodyPreviews setUserDomainName(String userDomainName) {
            this.userDomainName = userDomainName;
            return this;
        }
        public String getUserDomainName() {
            return this.userDomainName;
        }

    }

}
