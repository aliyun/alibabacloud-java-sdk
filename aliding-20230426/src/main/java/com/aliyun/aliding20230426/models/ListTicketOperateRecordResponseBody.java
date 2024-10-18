// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTicketOperateRecordResponseBody extends TeaModel {
    @NameInMap("records")
    public java.util.List<ListTicketOperateRecordResponseBodyRecords> records;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static ListTicketOperateRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTicketOperateRecordResponseBody self = new ListTicketOperateRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTicketOperateRecordResponseBody setRecords(java.util.List<ListTicketOperateRecordResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListTicketOperateRecordResponseBodyRecords> getRecords() {
        return this.records;
    }

    public ListTicketOperateRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTicketOperateRecordResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public ListTicketOperateRecordResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class ListTicketOperateRecordResponseBodyRecordsOperator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>贤文</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UnionId")
        public String unionId;

        public static ListTicketOperateRecordResponseBodyRecordsOperator build(java.util.Map<String, ?> map) throws Exception {
            ListTicketOperateRecordResponseBodyRecordsOperator self = new ListTicketOperateRecordResponseBodyRecordsOperator();
            return TeaModel.build(map, self);
        }

        public ListTicketOperateRecordResponseBodyRecordsOperator setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListTicketOperateRecordResponseBodyRecordsOperator setUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }
        public String getUnionId() {
            return this.unionId;
        }

    }

    public static class ListTicketOperateRecordResponseBodyRecordsTicketMemoAttachments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>wahaha.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>ticket/image/447xxxx9/43003/e2xxxec4243e940a1367_1625xxxx99.txt</p>
         */
        @NameInMap("Key")
        public String key;

        public static ListTicketOperateRecordResponseBodyRecordsTicketMemoAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListTicketOperateRecordResponseBodyRecordsTicketMemoAttachments self = new ListTicketOperateRecordResponseBodyRecordsTicketMemoAttachments();
            return TeaModel.build(map, self);
        }

        public ListTicketOperateRecordResponseBodyRecordsTicketMemoAttachments setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListTicketOperateRecordResponseBodyRecordsTicketMemoAttachments setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class ListTicketOperateRecordResponseBodyRecordsTicketMemo extends TeaModel {
        @NameInMap("Attachments")
        public java.util.List<ListTicketOperateRecordResponseBodyRecordsTicketMemoAttachments> attachments;

        /**
         * <strong>example:</strong>
         * <p>贤文结束工单</p>
         */
        @NameInMap("Memo")
        public String memo;

        public static ListTicketOperateRecordResponseBodyRecordsTicketMemo build(java.util.Map<String, ?> map) throws Exception {
            ListTicketOperateRecordResponseBodyRecordsTicketMemo self = new ListTicketOperateRecordResponseBodyRecordsTicketMemo();
            return TeaModel.build(map, self);
        }

        public ListTicketOperateRecordResponseBodyRecordsTicketMemo setAttachments(java.util.List<ListTicketOperateRecordResponseBodyRecordsTicketMemoAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<ListTicketOperateRecordResponseBodyRecordsTicketMemoAttachments> getAttachments() {
            return this.attachments;
        }

        public ListTicketOperateRecordResponseBodyRecordsTicketMemo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

    }

    public static class ListTicketOperateRecordResponseBodyRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>a8iSxxxxgtgiE</p>
         */
        @NameInMap("OpenTicketId")
        public String openTicketId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;originTakers&quot;:[{&quot;nickName&quot;:&quot;贤文&quot;,&quot;unionId&quot;:&quot;Dq9hxxxxwiEiE&quot;},{&quot;nickName&quot;:&quot;王鸿程&quot;,&quot;unionId&quot;:&quot;4kITooxxxx5wiEiE&quot;}]}</p>
         */
        @NameInMap("OperateData")
        public String operateData;

        /**
         * <strong>example:</strong>
         * <p>2021-07-09 19:26:09</p>
         */
        @NameInMap("OperateTime")
        public String operateTime;

        /**
         * <strong>example:</strong>
         * <p>FINISH</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <strong>example:</strong>
         * <p>结单</p>
         */
        @NameInMap("OperationDisplayName")
        public String operationDisplayName;

        @NameInMap("Operator")
        public ListTicketOperateRecordResponseBodyRecordsOperator operator;

        @NameInMap("TicketMemo")
        public ListTicketOperateRecordResponseBodyRecordsTicketMemo ticketMemo;

        public static ListTicketOperateRecordResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListTicketOperateRecordResponseBodyRecords self = new ListTicketOperateRecordResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListTicketOperateRecordResponseBodyRecords setOpenTicketId(String openTicketId) {
            this.openTicketId = openTicketId;
            return this;
        }
        public String getOpenTicketId() {
            return this.openTicketId;
        }

        public ListTicketOperateRecordResponseBodyRecords setOperateData(String operateData) {
            this.operateData = operateData;
            return this;
        }
        public String getOperateData() {
            return this.operateData;
        }

        public ListTicketOperateRecordResponseBodyRecords setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public ListTicketOperateRecordResponseBodyRecords setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListTicketOperateRecordResponseBodyRecords setOperationDisplayName(String operationDisplayName) {
            this.operationDisplayName = operationDisplayName;
            return this;
        }
        public String getOperationDisplayName() {
            return this.operationDisplayName;
        }

        public ListTicketOperateRecordResponseBodyRecords setOperator(ListTicketOperateRecordResponseBodyRecordsOperator operator) {
            this.operator = operator;
            return this;
        }
        public ListTicketOperateRecordResponseBodyRecordsOperator getOperator() {
            return this.operator;
        }

        public ListTicketOperateRecordResponseBodyRecords setTicketMemo(ListTicketOperateRecordResponseBodyRecordsTicketMemo ticketMemo) {
            this.ticketMemo = ticketMemo;
            return this;
        }
        public ListTicketOperateRecordResponseBodyRecordsTicketMemo getTicketMemo() {
            return this.ticketMemo;
        }

    }

}
