// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSearchLibRequest extends TeaModel {
    /**
     * <p>The configuration of the search library, in JSON string format. The fields include the following:</p>
     * <ul>
     * <li>faceGroupIds: The IDs of custom face recognition libraries. You can create these libraries by calling the CreateRecognitionLib operation. You can specify up to three library IDs, separated by commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;faceGroupIds&quot;:&quot;xxx1,xxx2,xx3&quot;}</p>
     */
    @NameInMap("SearchLibConfig")
    public String searchLibConfig;

    /**
     * <p>The name of the search library. The name can contain letters and digits. For IP camera (IPC) monitoring scenarios, the name must start with the <code>IPCamera_</code> prefix. For other scenarios, you can use a custom name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    public static CreateSearchLibRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchLibRequest self = new CreateSearchLibRequest();
        return TeaModel.build(map, self);
    }

    public CreateSearchLibRequest setSearchLibConfig(String searchLibConfig) {
        this.searchLibConfig = searchLibConfig;
        return this;
    }
    public String getSearchLibConfig() {
        return this.searchLibConfig;
    }

    public CreateSearchLibRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
