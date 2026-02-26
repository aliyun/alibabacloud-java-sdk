// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimpleQuery extends TeaModel {
    /**
     * <p>This parameter is required. The field name. For a list of the supported fields, see <a href="https://help.aliyun.com/document_detail/252856.html">Supported fields and operators</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Size</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>This parameter is required. The operator.</p>
     * <p>Enumerated values:</p>
     * <ul>
     * <li>exist: exists query.</li>
     * <li>not: logical NOT.</li>
     * <li>or: logical OR.</li>
     * <li>prefix: prefix query.</li>
     * <li>and: logical AND.</li>
     * <li>It: less than.</li>
     * <li>match-phrase: string match query.</li>
     * <li>gte: greater than or equal to.</li>
     * <li>eq: equal to.</li>
     * <li>lte: less than or equal to.</li>
     * <li>gt: greater than.</li>
     * <li>nested: You can perform logical condition queries within the same object when the data type of a field is ARRAY.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The subquery structure.</p>
     * <p>You can configure Subquery conditions only if you set the Operation parameter to and, or, not, or nested.</p>
     * <p>If you set the Operation parameter to and, or, or not, all query conditions specified by the SubQueries parameter must comply with the logical relationship of the parent query condition.</p>
     * <p>If you set the Operation parameter to nested, the parent field of a subquery must be of the ARRAY type, such as Labels. The operator of a subquery condition must be one or more of the following operators: and, or, and not. The field of the subquery must be a sub-field of the parent field.</p>
     * <p>For information about how to call the SimpleQuery operation, see <a href="https://help.aliyun.com/document_detail/478175.html">SimpleQuery</a>.</p>
     */
    @NameInMap("SubQueries")
    public java.util.List<SimpleQuery> subQueries;

    /**
     * <p>The field value. If you set the Operation parameter to and, or, not, or nested, this parameter is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Value")
    public String value;

    public static SimpleQuery build(java.util.Map<String, ?> map) throws Exception {
        SimpleQuery self = new SimpleQuery();
        return TeaModel.build(map, self);
    }

    public SimpleQuery setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public SimpleQuery setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public SimpleQuery setSubQueries(java.util.List<SimpleQuery> subQueries) {
        this.subQueries = subQueries;
        return this;
    }
    public java.util.List<SimpleQuery> getSubQueries() {
        return this.subQueries;
    }

    public SimpleQuery setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
