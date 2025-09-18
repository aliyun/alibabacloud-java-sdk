// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateStreamToSearchLibRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rtmp://xxx</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <strong>example:</strong>
     * <p>name-1</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>Stream_xxx</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    public static CreateStreamToSearchLibRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamToSearchLibRequest self = new CreateStreamToSearchLibRequest();
        return TeaModel.build(map, self);
    }

    public CreateStreamToSearchLibRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public CreateStreamToSearchLibRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateStreamToSearchLibRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
