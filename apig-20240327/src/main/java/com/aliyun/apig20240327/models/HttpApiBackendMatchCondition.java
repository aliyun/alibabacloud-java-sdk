// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiBackendMatchCondition extends TeaModel {
    /**
     * <p>The key of the matching condition.</p>
     * 
     * <strong>example:</strong>
     * <p>color</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The operator. Exact match, prefix match, and regular expressions are supported.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>equal</li>
     * <li>regex</li>
     * <li>prefix</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>equal</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The match type. Query and Header parameters can be matched.</p>
     * 
     * <strong>example:</strong>
     * <p>Query</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The value of the matching condition.</p>
     * 
     * <strong>example:</strong>
     * <p>gray</p>
     */
    @NameInMap("value")
    public String value;

    public static HttpApiBackendMatchCondition build(java.util.Map<String, ?> map) throws Exception {
        HttpApiBackendMatchCondition self = new HttpApiBackendMatchCondition();
        return TeaModel.build(map, self);
    }

    public HttpApiBackendMatchCondition setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public HttpApiBackendMatchCondition setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public HttpApiBackendMatchCondition setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public HttpApiBackendMatchCondition setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
