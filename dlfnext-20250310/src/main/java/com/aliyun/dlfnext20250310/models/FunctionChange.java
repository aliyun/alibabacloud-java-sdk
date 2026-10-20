// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class FunctionChange extends TeaModel {
    /**
     * <p>The change type.</p>
     * 
     * <strong>example:</strong>
     * <p>setOption</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>required in UpdateFunctionComment</p>
     * 
     * <strong>example:</strong>
     * <p>Function configuration update</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>required in AddDefinition/UpdateDefinition</p>
     */
    @NameInMap("definition")
    public FunctionDefinition definition;

    /**
     * <p>required in SetFunctionOption/RemoveFunctionOption</p>
     * 
     * <strong>example:</strong>
     * <p>namespaceSchema</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>required in AddDefinition/UpdateDefinition/DropDefinition</p>
     * 
     * <strong>example:</strong>
     * <p>my_function</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>required in SetFunctionOption</p>
     * 
     * <strong>example:</strong>
     * <p>IDC_MOVE</p>
     */
    @NameInMap("value")
    public String value;

    public static FunctionChange build(java.util.Map<String, ?> map) throws Exception {
        FunctionChange self = new FunctionChange();
        return TeaModel.build(map, self);
    }

    public FunctionChange setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public FunctionChange setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public FunctionChange setDefinition(FunctionDefinition definition) {
        this.definition = definition;
        return this;
    }
    public FunctionDefinition getDefinition() {
        return this.definition;
    }

    public FunctionChange setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public FunctionChange setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FunctionChange setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
