// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class QueryAsyncTaskResultResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The asynchronous task result.</p>
     */
    @NameInMap("Data")
    public QueryAsyncTaskResultResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAsyncTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAsyncTaskResultResponseBody self = new QueryAsyncTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAsyncTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAsyncTaskResultResponseBody setData(QueryAsyncTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAsyncTaskResultResponseBodyData getData() {
        return this.data;
    }

    public QueryAsyncTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAsyncTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAsyncTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAsyncTaskResultResponseBodyData extends TeaModel {
        /**
         * <p>The task result.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;url\&quot;:\&quot;<a href="https://aidge-bailian-oss.oss-cn-beijing.aliyuncs.com/gaolinfeng/pdf_trans/translated_en.pdf?security-token=CAISzwJ1q6Ft5B2yfSjIr5ntKv7urOdn9YTeaVbb1lQRfcxi2Kz%2BgDz2IHhMeHFgAeAbs%2Fw%2Fm29W6v4SlqZdVplOWU3Da%2BB364xK7Q754wRDcULuv9I%2Bk5SANTW5KXyShb3%2FAYjQSNfaZY3eCTTtnTNyxr3XbCirW0ffX7SClZ9gaKZ8PGD6F00kYu1bPQx%2FssQXGGLMPPK2SH7Qj3HXEVBjt3gX6wo9y9zmk53FsUWA1QKmlr9F%2BdWhGPX%2BMZkwZqUYesyuwel7epDG1CNt8BVQ%2FM909vccoWuf7onNXgQJs0rZbbaMoscSJQ51aaV%2FFaUBt%2FXmi%2Fxzt6nJkID626jAvGbZzsW0rumBtyikcIvBXr5RHT3rIrVAU%2BuEf19557bo3dbfkNdWOrtHZDY5Qn9nURKxAbSEg2uBaWTIIJPmvc97r9wbhjuH87JeC0jQHt3xuRqAATp5EbLOeo%2BZktMLbi%2FUsZgcvdIEIv3tPBCYfyJnh%2Bj6U8IyaLKQYHQBtjsfyMngFfS09jFdjBcUebzvYJs21gyU5u%2FZ9SeReh%2FacuIMVoggWy3o9Y%2BnBA2QPCcKqVM7XlwriM%2FJOAyhvj%2Bjtj7BUoyD%2BrSgF5brq5ykjN7t2U7oIAA%3D&OSSAccessKeyId=STS.NZXaDZA8FBF5kpj2TDqCN7iUb&Expires=1780315869&Signature=CdbMkhcED4Ovhw438ZVe5nzU1mk%3D%5C%5C%22%7D">https://aidge-bailian-oss.oss-cn-beijing.aliyuncs.com/gaolinfeng/pdf_trans/translated_en.pdf?security-token=CAISzwJ1q6Ft5B2yfSjIr5ntKv7urOdn9YTeaVbb1lQRfcxi2Kz%2BgDz2IHhMeHFgAeAbs%2Fw%2Fm29W6v4SlqZdVplOWU3Da%2BB364xK7Q754wRDcULuv9I%2Bk5SANTW5KXyShb3%2FAYjQSNfaZY3eCTTtnTNyxr3XbCirW0ffX7SClZ9gaKZ8PGD6F00kYu1bPQx%2FssQXGGLMPPK2SH7Qj3HXEVBjt3gX6wo9y9zmk53FsUWA1QKmlr9F%2BdWhGPX%2BMZkwZqUYesyuwel7epDG1CNt8BVQ%2FM909vccoWuf7onNXgQJs0rZbbaMoscSJQ51aaV%2FFaUBt%2FXmi%2Fxzt6nJkID626jAvGbZzsW0rumBtyikcIvBXr5RHT3rIrVAU%2BuEf19557bo3dbfkNdWOrtHZDY5Qn9nURKxAbSEg2uBaWTIIJPmvc97r9wbhjuH87JeC0jQHt3xuRqAATp5EbLOeo%2BZktMLbi%2FUsZgcvdIEIv3tPBCYfyJnh%2Bj6U8IyaLKQYHQBtjsfyMngFfS09jFdjBcUebzvYJs21gyU5u%2FZ9SeReh%2FacuIMVoggWy3o9Y%2BnBA2QPCcKqVM7XlwriM%2FJOAyhvj%2Bjtj7BUoyD%2BrSgF5brq5ykjN7t2U7oIAA%3D&amp;OSSAccessKeyId=STS.NZXaDZA8FBF5kpj2TDqCN7iUb&amp;Expires=1780315869&amp;Signature=CdbMkhcED4Ovhw438ZVe5nzU1mk%3D\\&quot;}</a></p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The downstream task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The usage information.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static QueryAsyncTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAsyncTaskResultResponseBodyData self = new QueryAsyncTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAsyncTaskResultResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryAsyncTaskResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryAsyncTaskResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryAsyncTaskResultResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
