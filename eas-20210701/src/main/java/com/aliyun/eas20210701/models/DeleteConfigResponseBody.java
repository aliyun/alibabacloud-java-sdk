// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteConfigResponseBody extends TeaModel {
    /**
     * <p>The number of deleted configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deleted")
    public Integer deleted;

    /**
     * <p>The operation result message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successfully deleted 1 configs</p>
     */
    @NameInMap("message")
    public String message;

    public static DeleteConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigResponseBody self = new DeleteConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConfigResponseBody setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }
    public Integer getDeleted() {
        return this.deleted;
    }

    public DeleteConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
