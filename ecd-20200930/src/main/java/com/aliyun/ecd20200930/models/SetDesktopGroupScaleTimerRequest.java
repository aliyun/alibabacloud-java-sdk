// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupScaleTimerRequest extends TeaModel {
    /**
     * <p>The ID of the cloud computer pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The information about the scheduled auto scaling task.</p>
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
         * <p>One option for the auto scaling policy. This option specifies the number of cloud computers that you want to create in the cloud computer pool. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BuyResAmount")
        public Integer buyResAmount;

        /**
         * <p>The cron expression of the trigger time.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 12 ? * 1</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The keep-alive duration of a session after the session is disconnected. Unit: milliseconds. Valid values: 180000 (3 minutes) to 345600000 (4 days). A value of 0 indicates that the session always keeps alive.</p>
         * <p>If a session is disconnected by the end user or accidentally due to a factor and the end user does not re-establish a connection with the session within the keep-alive duration, the session expires and unsaved data is deleted. If the end user successfully re-establishes a connection with the session within the keep-alive duration, the end user returns to the session and can still access the original data.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepDuration")
        public Long keepDuration;

        /**
         * <p>The load balancing policy for the multi-session cloud computer pool.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: depth-first</li>
         * <li>1: breadth first.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LoadPolicy")
        public Integer loadPolicy;

        /**
         * <p>One option for the auto scaling policy. This option specifies the maximum number of cloud computers that you can create in the cloud computer pool. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResAmount")
        public Integer maxResAmount;

        /**
         * <p>One option for the auto scaling policy. This option specifies the minimum number of cloud computers that you must create in the cloud computer pool. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MinResAmount")
        public Integer minResAmount;

        /**
         * <p>The threshold for the ratio of connected sessions. This parameter is the condition that triggers auto scaling in a multi-session cloud computer pool. Formula:</p>
         * <p><code>Ratio of connected sessions = Number of connected sessions/(Total number of cloud computers × Maximum number of sessions allowed for each cloud computer) × 100%</code>.</p>
         * <p>When the specified threshold is reached, new cloud computers are automatically created. When the specified threshold is not reached, idle cloud computers are released.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        /**
         * <p>The type of the auto scaling policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>drop</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>normal</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>peak</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>rise</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
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
