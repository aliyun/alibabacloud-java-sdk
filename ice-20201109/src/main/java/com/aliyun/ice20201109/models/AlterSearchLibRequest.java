// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AlterSearchLibRequest extends TeaModel {
    /**
     * <p>The search library configuration in JSON string format. It includes the following fields:</p>
     * <ul>
     * <li>faceGroupIds: the IDs of self-registered face libraries created by calling CreateRecognitionLib. A maximum of three self-registered face libraries are supported, concatenated by commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;faceGroupIds&quot;:&quot;xxx1,xxx2,xx3&quot;}</p>
     */
    @NameInMap("SearchLibConfig")
    public String searchLibConfig;

    /**
     * <p>The search library.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    public static AlterSearchLibRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterSearchLibRequest self = new AlterSearchLibRequest();
        return TeaModel.build(map, self);
    }

    public AlterSearchLibRequest setSearchLibConfig(String searchLibConfig) {
        this.searchLibConfig = searchLibConfig;
        return this;
    }
    public String getSearchLibConfig() {
        return this.searchLibConfig;
    }

    public AlterSearchLibRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
