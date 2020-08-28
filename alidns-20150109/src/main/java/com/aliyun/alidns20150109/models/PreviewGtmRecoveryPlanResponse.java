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

    }

    public static class PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfos extends TeaModel {
        @NameInMap("SwitchInfo")
        @Validation(required = true)
        public java.util.List<PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfosSwitchInfo> switchInfo;

        public static PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfos build(java.util.Map<String, ?> map) throws Exception {
            PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfos self = new PreviewGtmRecoveryPlanResponsePreviewsPreviewSwitchInfos();
            return TeaModel.build(map, self);
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

    }

    public static class PreviewGtmRecoveryPlanResponsePreviews extends TeaModel {
        @NameInMap("Preview")
        @Validation(required = true)
        public java.util.List<PreviewGtmRecoveryPlanResponsePreviewsPreview> preview;

        public static PreviewGtmRecoveryPlanResponsePreviews build(java.util.Map<String, ?> map) throws Exception {
            PreviewGtmRecoveryPlanResponsePreviews self = new PreviewGtmRecoveryPlanResponsePreviews();
            return TeaModel.build(map, self);
        }

    }

}
