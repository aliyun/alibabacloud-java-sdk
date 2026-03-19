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

    @NameInMap("Items")
    public DescribePreCheckProgressListResponseBodyItems items;

    /**
     * <p>The precheck progress. The value ranges from 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C4A45FE1-A903-470D-B113-F12A4DF942AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The precheck status. Valid values:</p>
     * <ul>
     * <li><p><strong>running</strong>: The precheck is in progress.</p>
     * </li>
     * <li><p><strong>failed</strong>: The precheck failed.</p>
     * </li>
     * <li><p><strong>finish</strong>: The precheck is complete.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>finish</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
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
        @NameInMap("BootTime")
        public Long bootTime;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("Item")
        public String item;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Names")
        public String names;

        @NameInMap("OrderNum")
        public String orderNum;

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
