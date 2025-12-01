// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribePreCheckProgressListResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of check items.</p>
     */
    @NameInMap("Items")
    public DescribePreCheckProgressListResponseBodyItems items;

    /**
     * <p>The precheck progress. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C4A45FE1-A903-470D-B113-F12A4DF942AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the precheck. Valid values:</p>
     * <ul>
     * <li><strong>running</strong>: The precheck is in progress.</li>
     * <li><strong>failed</strong>: The precheck failed.</li>
     * <li><strong>finish</strong>: The precheck is complete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>failed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribePreCheckProgressListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckProgressListResponseBody self = new DescribePreCheckProgressListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckProgressListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribePreCheckProgressListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribePreCheckProgressListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribePreCheckProgressListResponseBody setItems(DescribePreCheckProgressListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribePreCheckProgressListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribePreCheckProgressListResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public DescribePreCheckProgressListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePreCheckProgressListResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribePreCheckProgressListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail extends TeaModel {
        /**
         * <p>The time when the check for the item started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1583734969000</p>
         */
        @NameInMap("BootTime")
        public Long bootTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.RuntimeException: Could not find any schema ......</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The time when the check for the item was complete. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1583734969000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_OTHER</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The ID of the job for the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>uvk8f6fxnq5s</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of the group to which the check item belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_OTHER</p>
         */
        @NameInMap("Names")
        public String names;

        /**
         * <p>The sequence number of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OrderNum")
        public String orderNum;

        /**
         * <p>The state of the check for the item. Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: The check for the item is being initialized.</li>
         * <li><strong>warning</strong>: A warning is reported.</li>
         * <li><strong>catched</strong>: An exception occurs.</li>
         * <li><strong>running</strong>: The check for the item is in progress.</li>
         * <li><strong>failed</strong>: The check for the item fails.</li>
         * <li><strong>finish</strong>: The check for the item is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>warning</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail self = new DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail setBootTime(Long bootTime) {
            this.bootTime = bootTime;
            return this;
        }
        public Long getBootTime() {
            return this.bootTime;
        }

        public DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail setNames(String names) {
            this.names = names;
            return this;
        }
        public String getNames() {
            return this.names;
        }

        public DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail setOrderNum(String orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public String getOrderNum() {
            return this.orderNum;
        }

        public DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribePreCheckProgressListResponseBodyItems extends TeaModel {
        @NameInMap("PreCheckProgressDetail")
        public java.util.List<DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail> preCheckProgressDetail;

        public static DescribePreCheckProgressListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckProgressListResponseBodyItems self = new DescribePreCheckProgressListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckProgressListResponseBodyItems setPreCheckProgressDetail(java.util.List<DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail> preCheckProgressDetail) {
            this.preCheckProgressDetail = preCheckProgressDetail;
            return this;
        }
        public java.util.List<DescribePreCheckProgressListResponseBodyItemsPreCheckProgressDetail> getPreCheckProgressDetail() {
            return this.preCheckProgressDetail;
        }

    }

}
