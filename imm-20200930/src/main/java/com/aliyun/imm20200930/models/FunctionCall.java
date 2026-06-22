// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FunctionCall extends TeaModel {
    /**
     * <p>The parameters detected by the large language model.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *                     &quot;type&quot;: &quot;object&quot;,
     *                         &quot;name&quot;: {
     *                             &quot;type&quot;: &quot;string&quot;, 
     *                             &quot;description&quot;: &quot;需要检索的文件的文件名。可以为空 null&quot;
     *                         }, 
     *                     &quot;required&quot;: [
     *                         &quot;category&quot;
     *                     ]
     * }</p>
     */
    @NameInMap("Arguments")
    public String arguments;

    /**
     * <p>The function name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>search_file</p>
     */
    @NameInMap("Name")
    public String name;

    public static FunctionCall build(java.util.Map<String, ?> map) throws Exception {
        FunctionCall self = new FunctionCall();
        return TeaModel.build(map, self);
    }

    public FunctionCall setArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }
    public String getArguments() {
        return this.arguments;
    }

    public FunctionCall setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
