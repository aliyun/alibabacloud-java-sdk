// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDISyncTaskResponseBody extends TeaModel {
    /**
     * <p>The information that indicates whether the data synchronization task is created.</p>
     */
    @NameInMap("Data")
    public CreateDISyncTaskResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1411515937635973****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDISyncTaskResponseBody self = new CreateDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDISyncTaskResponseBody setData(CreateDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDISyncTaskResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the data synchronization task that is created.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The error message that is returned if the data synchronization task fails to be created. If the data synchronization task is successfully created, this parameter is not returned. If the data synchronization task fails to be created, an error message in the &quot;Invalid path: Workflow/xxxx/Data Integration&quot; format is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid path: Business Flow/xxxx/Data Integration</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The creation status of the data synchronization task. Valid values:</p>
         * <ul>
         * <li>success</li>
         * <li>fail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDISyncTaskResponseBodyData self = new CreateDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDISyncTaskResponseBodyData setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public CreateDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
