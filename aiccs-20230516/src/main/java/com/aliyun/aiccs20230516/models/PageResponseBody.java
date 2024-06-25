// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class PageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public PageResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>8EFC6D10-307B-1ECA-A8C6-7CBDF776AAD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>1683440860035</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static PageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageResponseBody self = new PageResponseBody();
        return TeaModel.build(map, self);
    }

    public PageResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public PageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageResponseBody setModel(PageResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public PageResponseBodyModel getModel() {
        return this.model;
    }

    public PageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public PageResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class PageResponseBodyModelList extends TeaModel {
        /**
         * <p>添加时间</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-06 10:10:10</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>过期时间</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <p>手机号码</p>
         * 
         * <strong>example:</strong>
         * <p>13314206082</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>手机号MD5</p>
         * 
         * <strong>example:</strong>
         * <p>e10adc3949ba59abbe56e057f20f883e</p>
         */
        @NameInMap("NumberMD5")
        public String numberMD5;

        /**
         * <p>备注</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Remark")
        public String remark;

        public static PageResponseBodyModelList build(java.util.Map<String, ?> map) throws Exception {
            PageResponseBodyModelList self = new PageResponseBodyModelList();
            return TeaModel.build(map, self);
        }

        public PageResponseBodyModelList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PageResponseBodyModelList setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public PageResponseBodyModelList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public PageResponseBodyModelList setNumberMD5(String numberMD5) {
            this.numberMD5 = numberMD5;
            return this;
        }
        public String getNumberMD5() {
            return this.numberMD5;
        }

        public PageResponseBodyModelList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class PageResponseBodyModel extends TeaModel {
        @NameInMap("List")
        public java.util.List<PageResponseBodyModelList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>97</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalPage")
        public Long totalPage;

        public static PageResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            PageResponseBodyModel self = new PageResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public PageResponseBodyModel setList(java.util.List<PageResponseBodyModelList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<PageResponseBodyModelList> getList() {
            return this.list;
        }

        public PageResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public PageResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public PageResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public PageResponseBodyModel setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
