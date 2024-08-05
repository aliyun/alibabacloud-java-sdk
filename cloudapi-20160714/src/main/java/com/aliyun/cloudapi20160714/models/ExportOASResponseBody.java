// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ExportOASResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UEsDBBQACAAIAABc8FgAAAAAAAAAAAAAAAA...</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876xxxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportOASResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportOASResponseBody self = new ExportOASResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportOASResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExportOASResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
