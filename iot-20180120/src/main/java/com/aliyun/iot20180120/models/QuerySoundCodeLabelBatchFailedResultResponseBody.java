// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeLabelBatchFailedResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.soundcodeservice.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySoundCodeLabelBatchFailedResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>sound code service has not been signed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>66FF51D3-<em><strong>-49F1-B1A2-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySoundCodeLabelBatchFailedResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeLabelBatchFailedResultResponseBody self = new QuerySoundCodeLabelBatchFailedResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeLabelBatchFailedResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySoundCodeLabelBatchFailedResultResponseBody setData(QuerySoundCodeLabelBatchFailedResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySoundCodeLabelBatchFailedResultResponseBodyData getData() {
        return this.data;
    }

    public QuerySoundCodeLabelBatchFailedResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySoundCodeLabelBatchFailedResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySoundCodeLabelBatchFailedResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySoundCodeLabelBatchFailedResultResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sound code label exist</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>7541</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        public static QuerySoundCodeLabelBatchFailedResultResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeLabelBatchFailedResultResponseBodyDataItems self = new QuerySoundCodeLabelBatchFailedResultResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeLabelBatchFailedResultResponseBodyDataItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QuerySoundCodeLabelBatchFailedResultResponseBodyDataItems setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QuerySoundCodeLabelBatchFailedResultResponseBodyDataItems setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

    }

    public static class QuerySoundCodeLabelBatchFailedResultResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySoundCodeLabelBatchFailedResultResponseBodyDataItems> items;

        public static QuerySoundCodeLabelBatchFailedResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeLabelBatchFailedResultResponseBodyData self = new QuerySoundCodeLabelBatchFailedResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeLabelBatchFailedResultResponseBodyData setItems(java.util.List<QuerySoundCodeLabelBatchFailedResultResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySoundCodeLabelBatchFailedResultResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
