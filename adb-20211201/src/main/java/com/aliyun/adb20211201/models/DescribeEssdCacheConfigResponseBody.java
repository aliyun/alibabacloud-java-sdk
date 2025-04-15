// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeEssdCacheConfigResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeEssdCacheConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C7EDB8E4-9769-4233-88C7-DCA4C9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEssdCacheConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEssdCacheConfigResponseBody self = new DescribeEssdCacheConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEssdCacheConfigResponseBody setData(DescribeEssdCacheConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEssdCacheConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeEssdCacheConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEssdCacheConfigResponseBodyData extends TeaModel {
        /**
         * <p>Specifies whether to enable the disk cache feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableEssdCache")
        public Boolean enableEssdCache;

        /**
         * <p>The disk cache size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("EssdCacheSize")
        public Integer essdCacheSize;

        public static DescribeEssdCacheConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEssdCacheConfigResponseBodyData self = new DescribeEssdCacheConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEssdCacheConfigResponseBodyData setEnableEssdCache(Boolean enableEssdCache) {
            this.enableEssdCache = enableEssdCache;
            return this;
        }
        public Boolean getEnableEssdCache() {
            return this.enableEssdCache;
        }

        public DescribeEssdCacheConfigResponseBodyData setEssdCacheSize(Integer essdCacheSize) {
            this.essdCacheSize = essdCacheSize;
            return this;
        }
        public Integer getEssdCacheSize() {
            return this.essdCacheSize;
        }

    }

}
