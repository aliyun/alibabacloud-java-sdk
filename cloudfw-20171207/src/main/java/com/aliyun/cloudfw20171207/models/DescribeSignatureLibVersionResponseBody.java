// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSignatureLibVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9C50C2A9-4BBB-5504-8ADA-C41A79B8C946</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>132</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li><p>ips</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>Basic Rules and Virtual Patching</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * <li><p>intelligence</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>Threat Intelligence</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ips</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>IPS-2307-02</p>
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

        public DescribeSignatureLibVersionResponseBodyVersion setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
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
