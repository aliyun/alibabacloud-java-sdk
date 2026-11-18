// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GlobalSceneItem extends TeaModel {
    /**
     * <p>The detailed information in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;snippet&quot;: &quot;As of March 7, 2025, SpaceX Starship has been launched 8 times, with 4 successes and 4 failures.&quot;,
     * &quot;snippetHighlighted&quot;: [&quot;8 times&quot;],
     * &quot;title&quot;: &quot;List of Starship launch missions&quot;
     * }</p>
     */
    @NameInMap("detail")
    public String detail;

    /**
     * <p>The type of vertical data.</p>
     * 
     * <strong>example:</strong>
     * <p>answerBox</p>
     */
    @NameInMap("type")
    public String type;

    public static GlobalSceneItem build(java.util.Map<String, ?> map) throws Exception {
        GlobalSceneItem self = new GlobalSceneItem();
        return TeaModel.build(map, self);
    }

    public GlobalSceneItem setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public GlobalSceneItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
