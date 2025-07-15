// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddStudioLayoutResponseBody extends TeaModel {
    /**
     * <p>The ID of the layout. You can use the ID as a request parameter in the following operations: DeleteStudioLayout, ModifyStudioLayout, and DescribeStudioLayouts.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddStudioLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddStudioLayoutResponseBody self = new AddStudioLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public AddStudioLayoutResponseBody setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public AddStudioLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
