// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CommonResponsePageableStructBody extends TeaModel {
    @NameInMap("Current")
    public String current;

    @NameInMap("List")
    public java.util.List<TriggerLogDTOStructBody> list;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Total")
    public String total;

    public static CommonResponsePageableStructBody build(java.util.Map<String, ?> map) throws Exception {
        CommonResponsePageableStructBody self = new CommonResponsePageableStructBody();
        return TeaModel.build(map, self);
    }

    public CommonResponsePageableStructBody setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public CommonResponsePageableStructBody setList(java.util.List<TriggerLogDTOStructBody> list) {
        this.list = list;
        return this;
    }
    public java.util.List<TriggerLogDTOStructBody> getList() {
        return this.list;
    }

    public CommonResponsePageableStructBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public CommonResponsePageableStructBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

}
