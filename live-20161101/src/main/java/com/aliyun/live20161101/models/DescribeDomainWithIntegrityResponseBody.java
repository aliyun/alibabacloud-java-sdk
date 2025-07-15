// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeDomainWithIntegrityResponseBody extends TeaModel {
    /**
     * <p>The verification information.</p>
     */
    @NameInMap("Content")
    public java.util.List<DescribeDomainWithIntegrityResponseBodyContent> content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainWithIntegrityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainWithIntegrityResponseBody self = new DescribeDomainWithIntegrityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainWithIntegrityResponseBody setContent(java.util.List<DescribeDomainWithIntegrityResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DescribeDomainWithIntegrityResponseBodyContent> getContent() {
        return this.content;
    }

    public DescribeDomainWithIntegrityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainWithIntegrityResponseBodyContent extends TeaModel {
        /**
         * <p>The column names.</p>
         */
        @NameInMap("Columns")
        public java.util.List<String> columns;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>1637825700000</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The subpoints.</p>
         */
        @NameInMap("Points")
        public java.util.List<String> points;

        public static DescribeDomainWithIntegrityResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainWithIntegrityResponseBodyContent self = new DescribeDomainWithIntegrityResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeDomainWithIntegrityResponseBodyContent setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public DescribeDomainWithIntegrityResponseBodyContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDomainWithIntegrityResponseBodyContent setPoints(java.util.List<String> points) {
            this.points = points;
            return this;
        }
        public java.util.List<String> getPoints() {
            return this.points;
        }

    }

}
