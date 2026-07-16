// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRuleMetadataResponseBody extends TeaModel {
    /**
     * <p>The list of metadata.</p>
     */
    @NameInMap("Datas")
    public java.util.List<DescribeRuleMetadataResponseBodyDatas> datas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6947DF8-7AC0-50D0-BADA-177646ABB85A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRuleMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleMetadataResponseBody self = new DescribeRuleMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleMetadataResponseBody setDatas(java.util.List<DescribeRuleMetadataResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<DescribeRuleMetadataResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public DescribeRuleMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRuleMetadataResponseBodyDatasChildren extends TeaModel {
        /**
         * <p>The human-readable content.</p>
         * 
         * <strong>example:</strong>
         * <p>北京市</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>CN-BJ</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRuleMetadataResponseBodyDatasChildren build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleMetadataResponseBodyDatasChildren self = new DescribeRuleMetadataResponseBodyDatasChildren();
            return TeaModel.build(map, self);
        }

        public DescribeRuleMetadataResponseBodyDatasChildren setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeRuleMetadataResponseBodyDatasChildren setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRuleMetadataResponseBodyDatas extends TeaModel {
        /**
         * <p>The subset of metadata.</p>
         */
        @NameInMap("Children")
        public java.util.List<DescribeRuleMetadataResponseBodyDatasChildren> children;

        /**
         * <p>The human-readable content.</p>
         * 
         * <strong>example:</strong>
         * <p>中国</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRuleMetadataResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleMetadataResponseBodyDatas self = new DescribeRuleMetadataResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public DescribeRuleMetadataResponseBodyDatas setChildren(java.util.List<DescribeRuleMetadataResponseBodyDatasChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<DescribeRuleMetadataResponseBodyDatasChildren> getChildren() {
            return this.children;
        }

        public DescribeRuleMetadataResponseBodyDatas setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeRuleMetadataResponseBodyDatas setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
