// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentPhoneNumberResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAIAgentPhoneNumberResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>******<strong><strong><strong>16-412C-B127-</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>186</p>
     */
    @NameInMap("TotalNumber")
    public Integer totalNumber;

    public static ListAIAgentPhoneNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentPhoneNumberResponseBody self = new ListAIAgentPhoneNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIAgentPhoneNumberResponseBody setData(java.util.List<ListAIAgentPhoneNumberResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAIAgentPhoneNumberResponseBodyData> getData() {
        return this.data;
    }

    public ListAIAgentPhoneNumberResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAIAgentPhoneNumberResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAIAgentPhoneNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAIAgentPhoneNumberResponseBody setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public static class ListAIAgentPhoneNumberResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>132*****683</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static ListAIAgentPhoneNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAIAgentPhoneNumberResponseBodyData self = new ListAIAgentPhoneNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAIAgentPhoneNumberResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListAIAgentPhoneNumberResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
