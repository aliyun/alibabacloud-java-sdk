// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIProjectConfigResponseBody extends TeaModel {
    /**
     * <p>The information about the modification.</p>
     */
    @NameInMap("Data")
    public UpdateDIProjectConfigResponseBodyData data;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDIProjectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIProjectConfigResponseBody self = new UpdateDIProjectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDIProjectConfigResponseBody setData(UpdateDIProjectConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDIProjectConfigResponseBodyData getData() {
        return this.data;
    }

    public UpdateDIProjectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDIProjectConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateDIProjectConfigResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the default global configuration of synchronization solutions is modified. Valid values:</p>
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

        public static UpdateDIProjectConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIProjectConfigResponseBodyData self = new UpdateDIProjectConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDIProjectConfigResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
