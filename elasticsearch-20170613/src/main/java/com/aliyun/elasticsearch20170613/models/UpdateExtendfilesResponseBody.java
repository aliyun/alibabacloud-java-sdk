// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateExtendfilesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public java.util.List<UpdateExtendfilesResponseBodyResult> result;

    public static UpdateExtendfilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExtendfilesResponseBody self = new UpdateExtendfilesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExtendfilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateExtendfilesResponseBody setResult(java.util.List<UpdateExtendfilesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<UpdateExtendfilesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class UpdateExtendfilesResponseBodyResult extends TeaModel {
        /**
         * <p>The size of the driver file. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>1853083</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The name of the driver file.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql-connector-java-6.0.2.jar</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The source of the driver file. This parameter is fixed as ORIGIN, which indicates that the driver file is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>ORIGIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static UpdateExtendfilesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateExtendfilesResponseBodyResult self = new UpdateExtendfilesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateExtendfilesResponseBodyResult setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public UpdateExtendfilesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExtendfilesResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
