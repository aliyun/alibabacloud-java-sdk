// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSearchLibRequest extends TeaModel {
    /**
     * <p>The configuration of the search library. The value is in JSON string format. Fields:</p>
     * <ul>
     * <li>faceGroupIds: the IDs of self-registered face libraries created by calling CreateRecognitionLib. A maximum of three self-registered face library IDs are supported, separated by commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;faceGroupIds&quot;:&quot;xxx1,xxx2,xx3&quot;}</p>
     */
    @NameInMap("SearchLibConfig")
    public String searchLibConfig;

    /**
     * <p>The name of the search library. The name must be a combination of letters and digits. For network monitoring camera (IPC) scenarios, the prefix must be &quot;IPCamera_&quot;. For other scenarios, you can customize the name.</p>
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
