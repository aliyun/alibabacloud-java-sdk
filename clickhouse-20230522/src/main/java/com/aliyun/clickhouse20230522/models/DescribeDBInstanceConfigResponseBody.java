// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceConfigResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public DescribeDBInstanceConfigResponseBodyData data;

    /**
     * <p>The ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>66428721-xxxx-xxxx-xxxx-3BD1B67837E0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceConfigResponseBody self = new DescribeDBInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceConfigResponseBody setData(DescribeDBInstanceConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceConfigResponseBodyDataParams extends TeaModel {
        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>Maximum number of concurrently executed queries. Zero means unlimited.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>Indicates whether the parameter takes effect dynamically (without requiring a restart).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDynamic")
        public Integer isDynamic;

        /**
         * <p>Indicates whether the parameter can be modified by users.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsUserModifiable")
        public Integer isUserModifiable;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>max_concurrent_queries</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The valid values of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[0-100]</p>
         */
        @NameInMap("Optional")
        public String optional;

        /**
         * <p>The parameter dependencies.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParamRelyRule")
        public String paramRelyRule;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBInstanceConfigResponseBodyDataParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceConfigResponseBodyDataParams self = new DescribeDBInstanceConfigResponseBodyDataParams();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceConfigResponseBodyDataParams setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeDBInstanceConfigResponseBodyDataParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeDBInstanceConfigResponseBodyDataParams setIsDynamic(Integer isDynamic) {
            this.isDynamic = isDynamic;
            return this;
        }
        public Integer getIsDynamic() {
            return this.isDynamic;
        }

        public DescribeDBInstanceConfigResponseBodyDataParams setIsUserModifiable(Integer isUserModifiable) {
            this.isUserModifiable = isUserModifiable;
            return this;
        }
        public Integer getIsUserModifiable() {
            return this.isUserModifiable;
        }

        public DescribeDBInstanceConfigResponseBodyDataParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBInstanceConfigResponseBodyDataParams setOptional(String optional) {
            this.optional = optional;
            return this;
        }
        public String getOptional() {
            return this.optional;
        }

        public DescribeDBInstanceConfigResponseBodyDataParams setParamRelyRule(String paramRelyRule) {
            this.paramRelyRule = paramRelyRule;
            return this;
        }
        public String getParamRelyRule() {
            return this.paramRelyRule;
        }

        public DescribeDBInstanceConfigResponseBodyDataParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstanceConfigResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The user parameters.</p>
         */
        @NameInMap("Params")
        public java.util.List<DescribeDBInstanceConfigResponseBodyDataParams> params;

        public static DescribeDBInstanceConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceConfigResponseBodyData self = new DescribeDBInstanceConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceConfigResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceConfigResponseBodyData setParams(java.util.List<DescribeDBInstanceConfigResponseBodyDataParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<DescribeDBInstanceConfigResponseBodyDataParams> getParams() {
            return this.params;
        }

    }

}
