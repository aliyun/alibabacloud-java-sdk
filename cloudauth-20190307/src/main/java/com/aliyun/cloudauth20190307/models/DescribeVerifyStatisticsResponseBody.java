// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyStatisticsResponseBody extends TeaModel {
    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>4E27D502-1287-526A-910C-881A3F023914</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Statistical results</p>
     */
    @NameInMap("ResultObject")
    public DescribeVerifyStatisticsResponseBodyResultObject resultObject;

    public static DescribeVerifyStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyStatisticsResponseBody self = new DescribeVerifyStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyStatisticsResponseBody setResultObject(DescribeVerifyStatisticsResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVerifyStatisticsResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVerifyStatisticsResponseBodyResultObjectItems extends TeaModel {
        /**
         * <p>Date.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-11</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>Client initialization pass rate.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("InitDevicePassRate")
        public String initDevicePassRate;

        /**
         * <p>Number of server initializations.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("InitService")
        public Long initService;

        /**
         * <p>Server initialization conversion rate.</p>
         * 
         * <strong>example:</strong>
         * <p>26.67</p>
         */
        @NameInMap("InitServiceConversionRate")
        public String initServiceConversionRate;

        /**
         * <p>Server initialization pass rate.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("InitServicePassRate")
        public String initServicePassRate;

        /**
         * <p>Pass rate.</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("PassRate")
        public String passRate;

        public static DescribeVerifyStatisticsResponseBodyResultObjectItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyStatisticsResponseBodyResultObjectItems self = new DescribeVerifyStatisticsResponseBodyResultObjectItems();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyStatisticsResponseBodyResultObjectItems setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeVerifyStatisticsResponseBodyResultObjectItems setInitDevicePassRate(String initDevicePassRate) {
            this.initDevicePassRate = initDevicePassRate;
            return this;
        }
        public String getInitDevicePassRate() {
            return this.initDevicePassRate;
        }

        public DescribeVerifyStatisticsResponseBodyResultObjectItems setInitService(Long initService) {
            this.initService = initService;
            return this;
        }
        public Long getInitService() {
            return this.initService;
        }

        public DescribeVerifyStatisticsResponseBodyResultObjectItems setInitServiceConversionRate(String initServiceConversionRate) {
            this.initServiceConversionRate = initServiceConversionRate;
            return this;
        }
        public String getInitServiceConversionRate() {
            return this.initServiceConversionRate;
        }

        public DescribeVerifyStatisticsResponseBodyResultObjectItems setInitServicePassRate(String initServicePassRate) {
            this.initServicePassRate = initServicePassRate;
            return this;
        }
        public String getInitServicePassRate() {
            return this.initServicePassRate;
        }

        public DescribeVerifyStatisticsResponseBodyResultObjectItems setPassRate(String passRate) {
            this.passRate = passRate;
            return this;
        }
        public String getPassRate() {
            return this.passRate;
        }

    }

    public static class DescribeVerifyStatisticsResponseBodyResultObject extends TeaModel {
        /**
         * <p>Number of client initializations.</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("InitDevice")
        public Long initDevice;

        /**
         * <p>Number of identity deduplication client initializations.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("InitDeviceId")
        public Long initDeviceId;

        /**
         * <p>Number of successful identity deduplication client initializations.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("InitDeviceIdSuccess")
        public Long initDeviceIdSuccess;

        /**
         * <p>Number of client initialization calls.</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("InitDeviceSuccess")
        public Long initDeviceSuccess;

        /**
         * <p>Number of service-side initializations.</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("InitService")
        public Long initService;

        /**
         * <p>Total number of identity deduplication server initialization requests.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("InitServiceId")
        public Long initServiceId;

        /**
         * <p>Number of successful identity deduplication server initializations.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("InitServiceIdSuccess")
        public Long initServiceIdSuccess;

        /**
         * <p>Number of successful service-side initialization authentications.</p>
         * 
         * <strong>example:</strong>
         * <p>134</p>
         */
        @NameInMap("InitServiceSuccess")
        public Long initServiceSuccess;

        /**
         * <p>Daily pass/conversion rate (PV).</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeVerifyStatisticsResponseBodyResultObjectItems> items;

        /**
         * <p>Number of client verifications.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("VerifyDevice")
        public Long verifyDevice;

        /**
         * <p>Number of identity deduplication client authentications.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("VerifyDeviceId")
        public Long verifyDeviceId;

        /**
         * <p>Number of successful identity deduplication client verifications.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("VerifyDeviceIdSuccess")
        public Long verifyDeviceIdSuccess;

        /**
         * <p>Number of successful identity deduplication client authentications.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("VerifyDeviceIdSuccessPassed")
        public Long verifyDeviceIdSuccessPassed;

        /**
         * <p>Number of successful client authentications.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("VerifyDeviceSuccess")
        public Long verifyDeviceSuccess;

        /**
         * <p>Number of successful client authentications.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("VerifyDeviceSuccessPassed")
        public Long verifyDeviceSuccessPassed;

        public static DescribeVerifyStatisticsResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyStatisticsResponseBodyResultObject self = new DescribeVerifyStatisticsResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setInitDevice(Long initDevice) {
            this.initDevice = initDevice;
            return this;
        }
        public Long getInitDevice() {
            return this.initDevice;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setInitDeviceId(Long initDeviceId) {
            this.initDeviceId = initDeviceId;
            return this;
        }
        public Long getInitDeviceId() {
            return this.initDeviceId;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setInitDeviceIdSuccess(Long initDeviceIdSuccess) {
            this.initDeviceIdSuccess = initDeviceIdSuccess;
            return this;
        }
        public Long getInitDeviceIdSuccess() {
            return this.initDeviceIdSuccess;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setInitDeviceSuccess(Long initDeviceSuccess) {
            this.initDeviceSuccess = initDeviceSuccess;
            return this;
        }
        public Long getInitDeviceSuccess() {
            return this.initDeviceSuccess;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setInitService(Long initService) {
            this.initService = initService;
            return this;
        }
        public Long getInitService() {
            return this.initService;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setInitServiceId(Long initServiceId) {
            this.initServiceId = initServiceId;
            return this;
        }
        public Long getInitServiceId() {
            return this.initServiceId;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setInitServiceIdSuccess(Long initServiceIdSuccess) {
            this.initServiceIdSuccess = initServiceIdSuccess;
            return this;
        }
        public Long getInitServiceIdSuccess() {
            return this.initServiceIdSuccess;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setInitServiceSuccess(Long initServiceSuccess) {
            this.initServiceSuccess = initServiceSuccess;
            return this;
        }
        public Long getInitServiceSuccess() {
            return this.initServiceSuccess;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setItems(java.util.List<DescribeVerifyStatisticsResponseBodyResultObjectItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeVerifyStatisticsResponseBodyResultObjectItems> getItems() {
            return this.items;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setVerifyDevice(Long verifyDevice) {
            this.verifyDevice = verifyDevice;
            return this;
        }
        public Long getVerifyDevice() {
            return this.verifyDevice;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setVerifyDeviceId(Long verifyDeviceId) {
            this.verifyDeviceId = verifyDeviceId;
            return this;
        }
        public Long getVerifyDeviceId() {
            return this.verifyDeviceId;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setVerifyDeviceIdSuccess(Long verifyDeviceIdSuccess) {
            this.verifyDeviceIdSuccess = verifyDeviceIdSuccess;
            return this;
        }
        public Long getVerifyDeviceIdSuccess() {
            return this.verifyDeviceIdSuccess;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setVerifyDeviceIdSuccessPassed(Long verifyDeviceIdSuccessPassed) {
            this.verifyDeviceIdSuccessPassed = verifyDeviceIdSuccessPassed;
            return this;
        }
        public Long getVerifyDeviceIdSuccessPassed() {
            return this.verifyDeviceIdSuccessPassed;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setVerifyDeviceSuccess(Long verifyDeviceSuccess) {
            this.verifyDeviceSuccess = verifyDeviceSuccess;
            return this;
        }
        public Long getVerifyDeviceSuccess() {
            return this.verifyDeviceSuccess;
        }

        public DescribeVerifyStatisticsResponseBodyResultObject setVerifyDeviceSuccessPassed(Long verifyDeviceSuccessPassed) {
            this.verifyDeviceSuccessPassed = verifyDeviceSuccessPassed;
            return this;
        }
        public Long getVerifyDeviceSuccessPassed() {
            return this.verifyDeviceSuccessPassed;
        }

    }

}
