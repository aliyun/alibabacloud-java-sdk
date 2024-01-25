// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class LabelSelector extends TeaModel {
    @NameInMap("matchExpressions")
    public java.util.List<LabelSelectorMatchExpressions> matchExpressions;

    @NameInMap("matchLabels")
    public java.util.Map<String, String> matchLabels;

    public static LabelSelector build(java.util.Map<String, ?> map) throws Exception {
        LabelSelector self = new LabelSelector();
        return TeaModel.build(map, self);
    }

    public LabelSelector setMatchExpressions(java.util.List<LabelSelectorMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }
    public java.util.List<LabelSelectorMatchExpressions> getMatchExpressions() {
        return this.matchExpressions;
    }

    public LabelSelector setMatchLabels(java.util.Map<String, String> matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }
    public java.util.Map<String, String> getMatchLabels() {
        return this.matchLabels;
    }

    public static class LabelSelectorMatchExpressions extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("operator")
        public String operator;

        @NameInMap("values")
        public java.util.List<String> values;

        public static LabelSelectorMatchExpressions build(java.util.Map<String, ?> map) throws Exception {
            LabelSelectorMatchExpressions self = new LabelSelectorMatchExpressions();
            return TeaModel.build(map, self);
        }

        public LabelSelectorMatchExpressions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public LabelSelectorMatchExpressions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public LabelSelectorMatchExpressions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
