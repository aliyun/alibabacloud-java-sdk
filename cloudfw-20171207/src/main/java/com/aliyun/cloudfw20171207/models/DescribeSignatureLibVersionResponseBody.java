// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSignatureLibVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information about the versions.</p>
     */
    @NameInMap("Version")
    public java.util.List<DescribeSignatureLibVersionResponseBodyVersion> version;

    public static DescribeSignatureLibVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignatureLibVersionResponseBody self = new DescribeSignatureLibVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSignatureLibVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSignatureLibVersionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSignatureLibVersionResponseBody setVersion(java.util.List<DescribeSignatureLibVersionResponseBodyVersion> version) {
        this.version = version;
        return this;
    }
    public java.util.List<DescribeSignatureLibVersionResponseBodyVersion> getVersion() {
        return this.version;
    }

    public static class DescribeSignatureLibVersionResponseBodyVersion extends TeaModel {
        /**
         * <p>The type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   ips</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    Basic Rules and Virtual Patching</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   intelligence</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    Threat Intelligence</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version number.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeSignatureLibVersionResponseBodyVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeSignatureLibVersionResponseBodyVersion self = new DescribeSignatureLibVersionResponseBodyVersion();
            return TeaModel.build(map, self);
        }

        public DescribeSignatureLibVersionResponseBodyVersion setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSignatureLibVersionResponseBodyVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
