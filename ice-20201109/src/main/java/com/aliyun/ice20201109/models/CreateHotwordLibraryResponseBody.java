// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateHotwordLibraryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("HotwordLibraryId")
    public String hotwordLibraryId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>13cbb83e-043c-4728-ac35-*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHotwordLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHotwordLibraryResponseBody self = new CreateHotwordLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHotwordLibraryResponseBody setHotwordLibraryId(String hotwordLibraryId) {
        this.hotwordLibraryId = hotwordLibraryId;
        return this;
    }
    public String getHotwordLibraryId() {
        return this.hotwordLibraryId;
    }

    public CreateHotwordLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
