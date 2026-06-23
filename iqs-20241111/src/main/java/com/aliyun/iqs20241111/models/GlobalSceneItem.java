// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GlobalSceneItem extends TeaModel {
    /**
     * <p>The detailed information in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;snippet&quot;: &quot;截至2025年3月7日，SpaceX星舰已经发射了8次，并取得4次成功及4次失败。&quot;,
     * &quot;snippetHighlighted&quot;: [&quot;8次&quot;],
     * &quot;title&quot;: &quot;星舰发射任务列表&quot;
     * }</p>
     */
    @NameInMap("detail")
    public String detail;

    /**
     * <p>The type of the vertical data.</p>
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
