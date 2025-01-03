// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListUserDrawRecordByPkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListUserDrawRecordByPkResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListUserDrawRecordByPkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserDrawRecordByPkResponseBody self = new ListUserDrawRecordByPkResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserDrawRecordByPkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserDrawRecordByPkResponseBody setData(java.util.List<ListUserDrawRecordByPkResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserDrawRecordByPkResponseBodyData> getData() {
        return this.data;
    }

    public ListUserDrawRecordByPkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserDrawRecordByPkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserDrawRecordByPkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUserDrawRecordByPkResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1401072305438324</p>
         */
        @NameInMap("aliyunPk")
        public String aliyunPk;

        /**
         * <strong>example:</strong>
         * <p>dsadsadsadas</p>
         */
        @NameInMap("drawGroup")
        public String drawGroup;

        /**
         * <strong>example:</strong>
         * <p>dasdsadasdas</p>
         */
        @NameInMap("drawPoolName")
        public String drawPoolName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("drawResult")
        public String drawResult;

        /**
         * <strong>example:</strong>
         * <p>1545726028000</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("taskGroupId")
        public String taskGroupId;

        /**
         * <strong>example:</strong>
         * <p>dsadsadasd</p>
         */
        @NameInMap("uccId")
        public String uccId;

        public static ListUserDrawRecordByPkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserDrawRecordByPkResponseBodyData self = new ListUserDrawRecordByPkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserDrawRecordByPkResponseBodyData setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public ListUserDrawRecordByPkResponseBodyData setDrawGroup(String drawGroup) {
            this.drawGroup = drawGroup;
            return this;
        }
        public String getDrawGroup() {
            return this.drawGroup;
        }

        public ListUserDrawRecordByPkResponseBodyData setDrawPoolName(String drawPoolName) {
            this.drawPoolName = drawPoolName;
            return this;
        }
        public String getDrawPoolName() {
            return this.drawPoolName;
        }

        public ListUserDrawRecordByPkResponseBodyData setDrawResult(String drawResult) {
            this.drawResult = drawResult;
            return this;
        }
        public String getDrawResult() {
            return this.drawResult;
        }

        public ListUserDrawRecordByPkResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUserDrawRecordByPkResponseBodyData setTaskGroupId(String taskGroupId) {
            this.taskGroupId = taskGroupId;
            return this;
        }
        public String getTaskGroupId() {
            return this.taskGroupId;
        }

        public ListUserDrawRecordByPkResponseBodyData setUccId(String uccId) {
            this.uccId = uccId;
            return this;
        }
        public String getUccId() {
            return this.uccId;
        }

    }

}
