// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ImportImageResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success. If the call fails, the corresponding error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The image identifiers returned for the import request.</p>
     */
    @NameInMap("Data")
    public ImportImageResponseBodyData data;

    /**
     * <p>The processing message returned by the API.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which is used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8737D130-BFD0-5D51-96F6-C08EB1139A25</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImportImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportImageResponseBody self = new ImportImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportImageResponseBody setData(ImportImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportImageResponseBodyData getData() {
        return this.data;
    }

    public ImportImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportImageResponseBodyData extends TeaModel {
        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-xxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static ImportImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportImageResponseBodyData self = new ImportImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportImageResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ImportImageResponseBodyData setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
