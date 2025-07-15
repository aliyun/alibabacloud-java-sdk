// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterLayoutResponseBody extends TeaModel {
    /**
     * <p>The ID of the layout.</p>
     * <p>Record the ID as it can be used to manage the layout being created.</p>
     * 
     * <strong>example:</strong>
     * <p>21926b36-7dd2-4fde-ae25-51b5bc8e****</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddCasterLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasterLayoutResponseBody self = new AddCasterLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasterLayoutResponseBody setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public AddCasterLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
