// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class LjxTestResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Id")
    public String id;

    @NameInMap("LongList")
    public java.util.List<Long> longList;

    @NameInMap("Maps")
    public java.util.List<LjxTestResponseBodyMaps> maps;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StringList")
    public java.util.List<String> stringList;

    @NameInMap("testtest")
    public LjxTestResponseBodyTesttest testtest;

    public static LjxTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LjxTestResponseBody self = new LjxTestResponseBody();
        return TeaModel.build(map, self);
    }

    public LjxTestResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public LjxTestResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LjxTestResponseBody setLongList(java.util.List<Long> longList) {
        this.longList = longList;
        return this;
    }
    public java.util.List<Long> getLongList() {
        return this.longList;
    }

    public LjxTestResponseBody setMaps(java.util.List<LjxTestResponseBodyMaps> maps) {
        this.maps = maps;
        return this;
    }
    public java.util.List<LjxTestResponseBodyMaps> getMaps() {
        return this.maps;
    }

    public LjxTestResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LjxTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LjxTestResponseBody setStringList(java.util.List<String> stringList) {
        this.stringList = stringList;
        return this;
    }
    public java.util.List<String> getStringList() {
        return this.stringList;
    }

    public LjxTestResponseBody setTesttest(LjxTestResponseBodyTesttest testtest) {
        this.testtest = testtest;
        return this;
    }
    public LjxTestResponseBodyTesttest getTesttest() {
        return this.testtest;
    }

    public static class LjxTestResponseBodyMaps extends TeaModel {
        @NameInMap("Param0")
        public java.util.Map<String, String> param0;

        public static LjxTestResponseBodyMaps build(java.util.Map<String, ?> map) throws Exception {
            LjxTestResponseBodyMaps self = new LjxTestResponseBodyMaps();
            return TeaModel.build(map, self);
        }

        public LjxTestResponseBodyMaps setParam0(java.util.Map<String, String> param0) {
            this.param0 = param0;
            return this;
        }
        public java.util.Map<String, String> getParam0() {
            return this.param0;
        }

    }

    public static class LjxTestResponseBodyTesttest extends TeaModel {
        @NameInMap("id")
        public String id;

        public static LjxTestResponseBodyTesttest build(java.util.Map<String, ?> map) throws Exception {
            LjxTestResponseBodyTesttest self = new LjxTestResponseBodyTesttest();
            return TeaModel.build(map, self);
        }

        public LjxTestResponseBodyTesttest setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
