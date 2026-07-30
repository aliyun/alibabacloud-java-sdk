// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupScaleTimerRequest extends TeaModel {
    /**
     * <p>The cloud computer pool ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of scheduled task information for automatic scaling.</p>
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
         * <p>The number of cloud computers to purchase. This is one of the scaling policy parameters. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BuyResAmount")
        public Integer buyResAmount;

        /**
         * <p>The cron expression for the trigger time.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 12 ? * 1</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The duration for which a session is retained after disconnection. Unit: milliseconds. Valid values: 180000 (3 minutes) to 345600000 (4 days). A value of 0 indicates that the session is always retained.</p>
         * <p>When a session is disconnected because the user actively disconnects or because of other unexpected factors, the retention period starts from the time of disconnection. If the user does not reconnect to the session within the retention period, the session is logged off and all unsaved data is destroyed. If the user reconnects within the retention period, the user can still access the original session and the data that existed before the disconnection.</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("KeepDuration")
        public Long keepDuration;

        /**
         * <p>The load balancing policy for the multi-session cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LoadPolicy")
        public Integer loadPolicy;

        /**
         * <p>The maximum number of cloud computers. This is one of the scaling policy parameters. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResAmount")
        public Integer maxResAmount;

        /**
         * <p>The minimum number of cloud computers. This is one of the scaling policy parameters. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MinResAmount")
        public Integer minResAmount;

        /**
         * <p>The session occupancy threshold, which is used as the trigger condition for automatic scaling of the multi-session cloud computer pool. The session occupancy is calculated by using the following formula:</p>
         * <p><code>Session occupancy = Number of attached sessions / (Total number of cloud computer resources × Maximum number of sessions supported per cloud computer) × 100%</code></p>
         * <p>When the session occupancy reaches this threshold, new cloud computers are created. When the session occupancy does not reach this threshold, excess cloud computers are deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>0.85</p>
         */
        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>rise</p>
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
