// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeIMVInfosResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ImvInfos")
    public java.util.List<DescribeIMVInfosResponseBodyImvInfos> imvInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIMVInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIMVInfosResponseBody self = new DescribeIMVInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIMVInfosResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeIMVInfosResponseBody setImvInfos(java.util.List<DescribeIMVInfosResponseBodyImvInfos> imvInfos) {
        this.imvInfos = imvInfos;
        return this;
    }
    public java.util.List<DescribeIMVInfosResponseBodyImvInfos> getImvInfos() {
        return this.imvInfos;
    }

    public DescribeIMVInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIMVInfosResponseBodyImvInfos extends TeaModel {
        @NameInMap("Base")
        public String base;

        @NameInMap("DetailInfo")
        public String detailInfo;

        @NameInMap("MV")
        public String MV;

        public static DescribeIMVInfosResponseBodyImvInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeIMVInfosResponseBodyImvInfos self = new DescribeIMVInfosResponseBodyImvInfos();
            return TeaModel.build(map, self);
        }

        public DescribeIMVInfosResponseBodyImvInfos setBase(String base) {
            this.base = base;
            return this;
        }
        public String getBase() {
            return this.base;
        }

        public DescribeIMVInfosResponseBodyImvInfos setDetailInfo(String detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public String getDetailInfo() {
            return this.detailInfo;
        }

        public DescribeIMVInfosResponseBodyImvInfos setMV(String MV) {
            this.MV = MV;
            return this;
        }
        public String getMV() {
            return this.MV;
        }

    }

}
