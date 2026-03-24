// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class FilterSetting extends TeaModel {
    /**
     * <p>订阅条件</p>
     */
    @NameInMap("conditions")
    public java.util.List<FilterSettingConditions> conditions;

    /**
     * <p>表达式</p>
     * 
     * <strong>example:</strong>
     * <p>1 and 2 or 3</p>
     */
    @NameInMap("expression")
    public String expression;

    /**
     * <p>条件间关系</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("relation")
    public String relation;

    public static FilterSetting build(java.util.Map<String, ?> map) throws Exception {
        FilterSetting self = new FilterSetting();
        return TeaModel.build(map, self);
    }

    public FilterSetting setConditions(java.util.List<FilterSettingConditions> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<FilterSettingConditions> getConditions() {
        return this.conditions;
    }

    public FilterSetting setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public FilterSetting setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

    public static class FilterSettingConditions extends TeaModel {
        /**
         * <p>字段</p>
         * 
         * <strong>example:</strong>
         * <p>severity</p>
         */
        @NameInMap("field")
        public String field;

        /**
         * <p>比较符</p>
         * 
         * <strong>example:</strong>
         * <p>EQ</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>值</p>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        @NameInMap("value")
        public String value;

        public static FilterSettingConditions build(java.util.Map<String, ?> map) throws Exception {
            FilterSettingConditions self = new FilterSettingConditions();
            return TeaModel.build(map, self);
        }

        public FilterSettingConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public FilterSettingConditions setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public FilterSettingConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
