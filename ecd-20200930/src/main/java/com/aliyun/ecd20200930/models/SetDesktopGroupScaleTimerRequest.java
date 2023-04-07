// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupScaleTimerRequest extends TeaModel {
    /**
     * <p>The ID of the desktop group.</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The information about the scheduled auto scaling tasks.</p>
     */
    @NameInMap("ScaleTimerInfos")
    public java.util.List<SetDesktopGroupScaleTimerRequestScaleTimerInfos> scaleTimerInfos;

    public static SetDesktopGroupScaleTimerRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopGroupScaleTimerRequest self = new SetDesktopGroupScaleTimerRequest();
        return TeaModel.build(map, self);
    }

    public SetDesktopGroupScaleTimerRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public SetDesktopGroupScaleTimerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetDesktopGroupScaleTimerRequest setScaleTimerInfos(java.util.List<SetDesktopGroupScaleTimerRequestScaleTimerInfos> scaleTimerInfos) {
        this.scaleTimerInfos = scaleTimerInfos;
        return this;
    }
    public java.util.List<SetDesktopGroupScaleTimerRequestScaleTimerInfos> getScaleTimerInfos() {
        return this.scaleTimerInfos;
    }

    public static class SetDesktopGroupScaleTimerRequestScaleTimerInfos extends TeaModel {
        /**
         * <p>The number of cloud desktops that you want to create in the desktop group. Valid values: 0 to 200. You must configure this parameter for the scaling policy.</p>
         */
        @NameInMap("BuyResAmount")
        public Integer buyResAmount;

        /**
         * <p>The CRON expression that is used when an auto scaling task is triggered.</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The keep-alive duration after the cloud desktop is disconnected. Unit: milliseconds.</p>
         */
        @NameInMap("KeepDuration")
        public Long keepDuration;

        /**
         * <p>The load balancing policy of the multi-session desktop group.</p>
         */
        @NameInMap("LoadPolicy")
        public Integer loadPolicy;

        /**
         * <p>The maximum number of cloud desktops in the workspace after scaling. Valid values: 0 to 200. You must configure this parameter for the scaling policy.</p>
         */
        @NameInMap("MaxResAmount")
        public Integer maxResAmount;

        /**
         * <p>The minimum number of cloud desktops that can be connected. Valid values: 0 to 200.</p>
         */
        @NameInMap("MinResAmount")
        public Integer minResAmount;

        /**
         * <p>The threshold for the ratio of connected sessions. This parameter is the condition that triggers auto scaling in a multi-session desktop group. `Ratio of connected sessions = Number of connected sessions/(Total number of cloud desktops × Maximum number of sessions supported by each cloud desktop) × 100%`. When the ratio of connected sessions is greater than the specified threshold, desktop scale-out is automatically triggered. When the ratio of connected sessions is smaller than the specified threshold, desktop scale-in is automatically triggered under a specific condition.</p>
         */
        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        /**
         * <p>The type of the policy.</p>
         */
        @NameInMap("Type")
        public String type;

        public static SetDesktopGroupScaleTimerRequestScaleTimerInfos build(java.util.Map<String, ?> map) throws Exception {
            SetDesktopGroupScaleTimerRequestScaleTimerInfos self = new SetDesktopGroupScaleTimerRequestScaleTimerInfos();
            return TeaModel.build(map, self);
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setBuyResAmount(Integer buyResAmount) {
            this.buyResAmount = buyResAmount;
            return this;
        }
        public Integer getBuyResAmount() {
            return this.buyResAmount;
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setKeepDuration(Long keepDuration) {
            this.keepDuration = keepDuration;
            return this;
        }
        public Long getKeepDuration() {
            return this.keepDuration;
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setLoadPolicy(Integer loadPolicy) {
            this.loadPolicy = loadPolicy;
            return this;
        }
        public Integer getLoadPolicy() {
            return this.loadPolicy;
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setMaxResAmount(Integer maxResAmount) {
            this.maxResAmount = maxResAmount;
            return this;
        }
        public Integer getMaxResAmount() {
            return this.maxResAmount;
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setMinResAmount(Integer minResAmount) {
            this.minResAmount = minResAmount;
            return this;
        }
        public Integer getMinResAmount() {
            return this.minResAmount;
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setRatioThreshold(Float ratioThreshold) {
            this.ratioThreshold = ratioThreshold;
            return this;
        }
        public Float getRatioThreshold() {
            return this.ratioThreshold;
        }

        public SetDesktopGroupScaleTimerRequestScaleTimerInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
